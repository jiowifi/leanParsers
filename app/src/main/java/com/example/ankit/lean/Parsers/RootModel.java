import java.util.ArrayList;

class RootModel {

	public String start_time;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String email;
	public String timezone;
	public String type;
	public String background_image;
	public String logo;
	public String privacy;
	public String end_time;
	public int id;
	public String organizer_name;
	public VersionModel _version;
	public String name;
	public CreatorModel _creator;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String state;
	public String organizer_description;
	public String topic;

	public RootModel(String start_time, CopyrightModel copyright, String code_of_conduct, String email, String timezone, String type, String background_image, String logo, String privacy, String end_time, int id, String organizer_name, VersionModel version, String name, CreatorModel creator, String location_name, Call_for_papersModel call_for_papers, String description, ArrayList<Social_linksModel> social_links, String schedule_published_on, String state, String organizer_description, String topic) {

		this.start_time = start_time;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.timezone = timezone;
		this.type = type;
		this.background_image = background_image;
		this.logo = logo;
		this.privacy = privacy;
		this.end_time = end_time;
		this.id = id;
		this.organizer_name = organizer_name;
		this._version = version;
		this.name = name;
		this._creator = creator;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.organizer_description = organizer_description;
		this.topic = topic;

	}

}