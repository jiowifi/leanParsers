import java.util.ArrayList;

class RootModel {

	public String type;
	public String email;
	public String state;
	public String background_image;
	public String privacy;
	public String name;
	public String organizer_description;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public VersionModel _version;
	public int id;
	public String schedule_published_on;
	public String location_name;
	public CreatorModel _creator;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public CopyrightModel _copyright;
	public String end_time;
	public String code_of_conduct;
	public String timezone;
	public String topic;

	public RootModel(String type, String email, String state, String background_image, String privacy, String name, String organizer_description, String start_time, ArrayList<Social_linksModel> social_links, String description, VersionModel version, int id, String schedule_published_on, String location_name, CreatorModel creator, String organizer_name, Call_for_papersModel call_for_papers, String logo, CopyrightModel copyright, String end_time, String code_of_conduct, String timezone, String topic) {

		this.type = type;
		this.email = email;
		this.state = state;
		this.background_image = background_image;
		this.privacy = privacy;
		this.name = name;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.social_links = social_links;
		this.description = description;
		this._version = version;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this._copyright = copyright;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.topic = topic;

	}

}