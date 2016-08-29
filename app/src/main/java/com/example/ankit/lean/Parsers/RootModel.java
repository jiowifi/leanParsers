import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String privacy;
	public int id;
	public String code_of_conduct;
	public String type;
	public String state;
	public CreatorModel _creator;
	public String end_time;
	public String name;
	public String start_time;
	public String timezone;
	public String organizer_name;
	public String logo;
	public String schedule_published_on;
	public VersionModel _version;
	public String description;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String topic;

	public RootModel(String organizer_description, String privacy, int id, String code_of_conduct, String type, String state, CreatorModel creator, String end_time, String name, String start_time, String timezone, String organizer_name, String logo, String schedule_published_on, VersionModel version, String description, String background_image, Call_for_papersModel call_for_papers, CopyrightModel copyright, String email, ArrayList<Social_linksModel> social_links, String location_name, String topic) {

		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.state = state;
		this._creator = creator;
		this.end_time = end_time;
		this.name = name;
		this.start_time = start_time;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.description = description;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.email = email;
		this.social_links = social_links;
		this.location_name = location_name;
		this.topic = topic;

	}

}