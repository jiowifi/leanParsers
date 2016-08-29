import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String name;
	public CreatorModel _creator;
	public String description;
	public String start_time;
	public String state;
	public String background_image;
	public String location_name;
	public String privacy;
	public String topic;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String code_of_conduct;
	public String type;
	public VersionModel _version;
	public String schedule_published_on;
	public String email;
	public int id;
	public String logo;

	public RootModel(String organizer_description, String name, CreatorModel creator, String description, String start_time, String state, String background_image, String location_name, String privacy, String topic, String end_time, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String timezone, CopyrightModel copyright, String organizer_name, String code_of_conduct, String type, VersionModel version, String schedule_published_on, String email, int id, String logo) {

		this.organizer_description = organizer_description;
		this.name = name;
		this._creator = creator;
		this.description = description;
		this.start_time = start_time;
		this.state = state;
		this.background_image = background_image;
		this.location_name = location_name;
		this.privacy = privacy;
		this.topic = topic;
		this.end_time = end_time;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.id = id;
		this.logo = logo;

	}

}