import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public CopyrightModel _copyright;
	public String privacy;
	public String location_name;
	public String topic;
	public CreatorModel _creator;
	public String type;
	public int id;
	public String background_image;
	public String schedule_published_on;
	public String code_of_conduct;
	public String logo;
	public String email;
	public String organizer_name;
	public VersionModel _version;
	public String end_time;
	public String start_time;
	public String name;
	public String timezone;
	public String description;

	public RootModel(Call_for_papersModel call_for_papers, String organizer_description, ArrayList<Social_linksModel> social_links, String state, CopyrightModel copyright, String privacy, String location_name, String topic, CreatorModel creator, String type, int id, String background_image, String schedule_published_on, String code_of_conduct, String logo, String email, String organizer_name, VersionModel version, String end_time, String start_time, String name, String timezone, String description) {

		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.state = state;
		this._copyright = copyright;
		this.privacy = privacy;
		this.location_name = location_name;
		this.topic = topic;
		this._creator = creator;
		this.type = type;
		this.id = id;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.email = email;
		this.organizer_name = organizer_name;
		this._version = version;
		this.end_time = end_time;
		this.start_time = start_time;
		this.name = name;
		this.timezone = timezone;
		this.description = description;

	}

}