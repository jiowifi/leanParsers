import java.util.ArrayList;

class RootModel {

	public String end_time;
	public VersionModel _version;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String logo;
	public String location_name;
	public String organizer_name;
	public String background_image;
	public String email;
	public String privacy;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String topic;
	public String timezone;
	public String name;
	public String code_of_conduct;
	public String description;
	public String start_time;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String state;

	public RootModel(String end_time, VersionModel version, String schedule_published_on, Call_for_papersModel call_for_papers, String type, String logo, String location_name, String organizer_name, String background_image, String email, String privacy, CreatorModel creator, CopyrightModel copyright, String topic, String timezone, String name, String code_of_conduct, String description, String start_time, int id, ArrayList<Social_linksModel> social_links, String organizer_description, String state) {

		this.end_time = end_time;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.logo = logo;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.email = email;
		this.privacy = privacy;
		this._creator = creator;
		this._copyright = copyright;
		this.topic = topic;
		this.timezone = timezone;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.start_time = start_time;
		this.id = id;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.state = state;

	}

}