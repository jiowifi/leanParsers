import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String privacy;
	public String organizer_description;
	public VersionModel _version;
	public String schedule_published_on;
	public String name;
	public String code_of_conduct;
	public String description;
	public int id;
	public String location_name;
	public String start_time;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String end_time;
	public CreatorModel _creator;
	public String timezone;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String type;
	public String state;
	public String topic;

	public RootModel(String background_image, String privacy, String organizer_description, VersionModel version, String schedule_published_on, String name, String code_of_conduct, String description, int id, String location_name, String start_time, String email, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String logo, String end_time, CreatorModel creator, String timezone, CopyrightModel copyright, String organizer_name, String type, String state, String topic) {

		this.background_image = background_image;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.id = id;
		this.location_name = location_name;
		this.start_time = start_time;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.logo = logo;
		this.end_time = end_time;
		this._creator = creator;
		this.timezone = timezone;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.type = type;
		this.state = state;
		this.topic = topic;

	}

}