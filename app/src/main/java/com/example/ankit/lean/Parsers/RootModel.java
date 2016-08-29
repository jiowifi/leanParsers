import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String schedule_published_on;
	public String logo;
	public String timezone;
	public String end_time;
	public String description;
	public CreatorModel _creator;
	public String location_name;
	public String email;
	public int id;
	public CopyrightModel _copyright;
	public String start_time;
	public String organizer_description;
	public String type;
	public String name;
	public String state;
	public String background_image;
	public String topic;

	public RootModel(String code_of_conduct, VersionModel version, Call_for_papersModel call_for_papers, String organizer_name, ArrayList<Social_linksModel> social_links, String privacy, String schedule_published_on, String logo, String timezone, String end_time, String description, CreatorModel creator, String location_name, String email, int id, CopyrightModel copyright, String start_time, String organizer_description, String type, String name, String state, String background_image, String topic) {

		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.timezone = timezone;
		this.end_time = end_time;
		this.description = description;
		this._creator = creator;
		this.location_name = location_name;
		this.email = email;
		this.id = id;
		this._copyright = copyright;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.type = type;
		this.name = name;
		this.state = state;
		this.background_image = background_image;
		this.topic = topic;

	}

}