import java.util.ArrayList;

class RootModel {

	public String logo;
	public String organizer_name;
	public VersionModel _version;
	public String description;
	public int id;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String end_time;
	public String type;
	public String state;
	public String schedule_published_on;
	public String location_name;
	public String background_image;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String organizer_description;
	public String start_time;
	public CreatorModel _creator;
	public String email;
	public String code_of_conduct;
	public String topic;

	public RootModel(String logo, String organizer_name, VersionModel version, String description, int id, String name, Call_for_papersModel call_for_papers, String timezone, String end_time, String type, String state, String schedule_published_on, String location_name, String background_image, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String privacy, String organizer_description, String start_time, CreatorModel creator, String email, String code_of_conduct, String topic) {

		this.logo = logo;
		this.organizer_name = organizer_name;
		this._version = version;
		this.description = description;
		this.id = id;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.end_time = end_time;
		this.type = type;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.background_image = background_image;
		this._copyright = copyright;
		this.social_links = social_links;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this._creator = creator;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;

	}

}