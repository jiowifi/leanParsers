import java.util.ArrayList;

class RootModel {

	public String logo;
	public String organizer_name;
	public String description;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public int id;
	public String timezone;
	public String email;
	public String start_time;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String end_time;
	public String name;
	public VersionModel _version;
	public String topic;
	public String state;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String privacy;
	public String organizer_description;
	public String type;

	public RootModel(String logo, String organizer_name, String description, String code_of_conduct, CopyrightModel copyright, int id, String timezone, String email, String start_time, String background_image, Call_for_papersModel call_for_papers, String location_name, String end_time, String name, VersionModel version, String topic, String state, String schedule_published_on, ArrayList<Social_linksModel> social_links, CreatorModel creator, String privacy, String organizer_description, String type) {

		this.logo = logo;
		this.organizer_name = organizer_name;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.id = id;
		this.timezone = timezone;
		this.email = email;
		this.start_time = start_time;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.end_time = end_time;
		this.name = name;
		this._version = version;
		this.topic = topic;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this._creator = creator;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.type = type;

	}

}