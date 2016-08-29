import java.util.ArrayList;

class RootModel {

	public String logo;
	public CopyrightModel _copyright;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String timezone;
	public String organizer_name;
	public String schedule_published_on;
	public String organizer_description;
	public String start_time;
	public int id;
	public String name;
	public String topic;
	public String email;
	public String background_image;
	public VersionModel _version;
	public String description;
	public String location_name;
	public CreatorModel _creator;
	public String type;
	public String end_time;
	public String code_of_conduct;

	public RootModel(String logo, CopyrightModel copyright, String privacy, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String state, String timezone, String organizer_name, String schedule_published_on, String organizer_description, String start_time, int id, String name, String topic, String email, String background_image, VersionModel version, String description, String location_name, CreatorModel creator, String type, String end_time, String code_of_conduct) {

		this.logo = logo;
		this._copyright = copyright;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.state = state;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.id = id;
		this.name = name;
		this.topic = topic;
		this.email = email;
		this.background_image = background_image;
		this._version = version;
		this.description = description;
		this.location_name = location_name;
		this._creator = creator;
		this.type = type;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;

	}

}