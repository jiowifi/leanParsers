import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String name;
	public CreatorModel _creator;
	public String email;
	public VersionModel _version;
	public String type;
	public String code_of_conduct;
	public String timezone;
	public String schedule_published_on;
	public String logo;
	public String background_image;
	public int id;
	public String privacy;
	public String location_name;
	public String organizer_description;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String description;
	public CopyrightModel _copyright;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String topic;

	public RootModel(String organizer_name, String name, CreatorModel creator, String email, VersionModel version, String type, String code_of_conduct, String timezone, String schedule_published_on, String logo, String background_image, int id, String privacy, String location_name, String organizer_description, String start_time, ArrayList<Social_linksModel> social_links, String state, String description, CopyrightModel copyright, String end_time, Call_for_papersModel call_for_papers, String topic) {

		this.organizer_name = organizer_name;
		this.name = name;
		this._creator = creator;
		this.email = email;
		this._version = version;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.background_image = background_image;
		this.id = id;
		this.privacy = privacy;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.social_links = social_links;
		this.state = state;
		this.description = description;
		this._copyright = copyright;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.topic = topic;

	}

}