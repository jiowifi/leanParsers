import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public CreatorModel _creator;
	public String background_image;
	public String start_time;
	public String organizer_name;
	public String end_time;
	public String organizer_description;
	public String description;
	public String type;
	public String state;
	public String privacy;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String location_name;
	public String email;
	public String name;
	public int id;
	public String topic;

	public RootModel(String code_of_conduct, CreatorModel creator, String background_image, String start_time, String organizer_name, String end_time, String organizer_description, String description, String type, String state, String privacy, String logo, Call_for_papersModel call_for_papers, String timezone, CopyrightModel copyright, String schedule_published_on, ArrayList<Social_linksModel> social_links, VersionModel version, String location_name, String email, String name, int id, String topic) {

		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.background_image = background_image;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.description = description;
		this.type = type;
		this.state = state;
		this.privacy = privacy;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this._version = version;
		this.location_name = location_name;
		this.email = email;
		this.name = name;
		this.id = id;
		this.topic = topic;

	}

}