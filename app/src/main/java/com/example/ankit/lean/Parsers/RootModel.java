import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String description;
	public String organizer_description;
	public String privacy;
	public String location_name;
	public String state;
	public String name;
	public String schedule_published_on;
	public String code_of_conduct;
	public String type;
	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String timezone;
	public int id;
	public CreatorModel _creator;
	public String background_image;
	public String logo;
	public String end_time;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String topic;

	public RootModel(String organizer_name, String description, String organizer_description, String privacy, String location_name, String state, String name, String schedule_published_on, String code_of_conduct, String type, String start_time, Call_for_papersModel call_for_papers, VersionModel version, String timezone, int id, CreatorModel creator, String background_image, String logo, String end_time, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String email, String topic) {

		this.organizer_name = organizer_name;
		this.description = description;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.location_name = location_name;
		this.state = state;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.timezone = timezone;
		this.id = id;
		this._creator = creator;
		this.background_image = background_image;
		this.logo = logo;
		this.end_time = end_time;
		this._copyright = copyright;
		this.social_links = social_links;
		this.email = email;
		this.topic = topic;

	}

}