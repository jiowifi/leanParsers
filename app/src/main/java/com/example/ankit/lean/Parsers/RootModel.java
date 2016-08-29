import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String timezone;
	public String email;
	public CreatorModel _creator;
	public String privacy;
	public String start_time;
	public String type;
	public String state;
	public String code_of_conduct;
	public String background_image;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String topic;
	public String location_name;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public int id;
	public String description;
	public String end_time;
	public VersionModel _version;
	public String logo;

	public RootModel(String organizer_description, String timezone, String email, CreatorModel creator, String privacy, String start_time, String type, String state, String code_of_conduct, String background_image, String organizer_name, CopyrightModel copyright, String topic, String location_name, String name, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String schedule_published_on, int id, String description, String end_time, VersionModel version, String logo) {

		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.email = email;
		this._creator = creator;
		this.privacy = privacy;
		this.start_time = start_time;
		this.type = type;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.topic = topic;
		this.location_name = location_name;
		this.name = name;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.description = description;
		this.end_time = end_time;
		this._version = version;
		this.logo = logo;

	}

}